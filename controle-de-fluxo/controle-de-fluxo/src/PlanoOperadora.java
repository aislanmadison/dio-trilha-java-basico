public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T"; // Diz-se T, M ou G

        switch (plano){
            case "T": {
                System.out.println("5gb Youtube");
            }

            case "M": {
                System.out.println("Whatsapp e Instagram grátis");
            }

            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
