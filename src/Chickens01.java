public class Chickens01 {
    public static void main(String[] args) {
        int count=15;   //Contagem inicia de ovos.
        int a, b, c;   //Segunda, terça e quarta.
        a = count;     //Segunda feira, contagem incial de ovos.
        b = count + 5; //Terça feira, contagem de ovos com mais uma galinha.
        c = count - 5; //Quarta feira, contagem de ovos com menos duas galinhas.
        
        System.out.println("Segunda feira = " + a + ", ");
        System.out.println("Terca feira = " + b + ", ");
        System.out.println("quarta feira = " + c + ", ");
    }   // Segunda = 15 ovos, Terça = 20 ovos, Quarta = 10 ovos.
}
