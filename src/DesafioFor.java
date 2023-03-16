
    public class DesafioFor {
        public static void main(String[] args) {
            Boolean X = true;
            for (String valor = "#";X == true;){
                System.out.println(valor);
                valor += "#" ;
                if (valor.equalsIgnoreCase("######")){
                    X = false;
                }
            }
        }
    }

