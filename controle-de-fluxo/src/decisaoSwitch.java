public class decisaoSwitch {
    public static void main(String[] args) {

        String dia = "Terça";
        
        switch dia {
            case "Segunda":
            System.out.print(2);
            break;
            case "Terça":
            System.out.print(3);
            break;
            case "Quarta":
            System.out.print(4);
            break;
            case "Quinta":
            System.out.print(5);
            break;
            case "Sexta":
            System.out.print(6);
            break;
            case "Sábado":
            System.out.print(7);
            break;
            case "Domingo":
            System.out.print(1);
            break;
            default:
            System.out.print("Dia inválido");
            break;
        }
    }
}
