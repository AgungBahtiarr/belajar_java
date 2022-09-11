package Java_Dasar;
public class switch_statement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Anda lulus dengan nilai sempurna");
                break;
            case "B":
                System.out.println("Anda lulus dengan nilai baik");
                break;
            case "C":
                System.out.println("Anda lulus dengan nilai cukup");
                break;
            case "D":
                System.out.println("Maaf anda tidak lulus");
                break;
            default:
                System.out.println("Anda salah jurusan");
                break;
        }
// switch dengan lamda switch

        switch (nilai) {
            case "A" -> System.out.println("Anda lulus dengan nilai sempurna");
            case "B" -> System.out.println("Anda lulus dengan nilai baik");
            case "C" -> System.out.println("Anda lulus dengan nilai cukup");
            case "D" -> System.out.println("Maaf anda tidak lulus ");
            default -> {
                System.out.println("Anda Salah jurusan");
            }

        }
// yield
        String ucapan;
        ucapan = switch (nilai) {
            case "A":
                yield "wow keren";
            case "B":
                yield "baik";
            default:
                yield "Ssalah";
        };
        System.out.println(ucapan);
    }
}
