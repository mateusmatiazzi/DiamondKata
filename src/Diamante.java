public class Diamante {
    public String retornaDiamante(char letra) {
        return criaDiamante(letra);
    }

    private String criaDiamante(char letra){
        String meioDiamante = "";
        String diamante = "";
        int posicaoDaLetraNoAlfabeto = letraNoAlfabeto(letra);
        for (char letraDoDiamante='A';letraDoDiamante<letra;letraDoDiamante++){
             meioDiamante += geraStringComEspacos(letraDoDiamante, posicaoDaLetraNoAlfabeto*2+1);
             meioDiamante += "\n";
        }
        diamante = meioDiamante + geraStringComEspacos(letra, posicaoDaLetraNoAlfabeto*2+1);
        diamante += new StringBuilder(meioDiamante).reverse().toString();
        return diamante;
    }

    private String geraStringComEspacos(char letra, int quantidadeDeEspacos){
        StringBuilder stringComEspacos = new StringBuilder(geraStringSoComEspacos(quantidadeDeEspacos));
        int posicaoDaLetraNoAlfabeto = letraNoAlfabeto(letra);
        int metadeDaString = quantidadeDeEspacos/2;

        stringComEspacos.setCharAt(metadeDaString-posicaoDaLetraNoAlfabeto, letra);
        stringComEspacos.setCharAt(metadeDaString+posicaoDaLetraNoAlfabeto, letra);

        return stringComEspacos.toString();
    }

    private String geraStringSoComEspacos(int quantidadeDeEspacos){
        StringBuilder stringComEspacos = new StringBuilder();
        for (int aux=0;aux<quantidadeDeEspacos;aux++){
            stringComEspacos.append(" ");
        }
        return stringComEspacos.toString();
    }

    private int letraNoAlfabeto(char letra){
        return letra - 'A';
    }
}
