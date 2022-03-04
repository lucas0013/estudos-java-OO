/* Alunos: Ágatha Martiniano Fernandes - Matrícula: 20197707303
           Lucas dos Santos de Sousa - Matrícula: 20191108940
           Renan Cesar Ribeiro da Costa - Matrícula: 20182101187
*/           

public class Main
{
    public static void main(String[] args) {
        int i, cont =0;
        for(i=1; i<=1000000000; i++){
            String retorno = numeroperfeito(i);
            if (retorno.isEmpty() == false) {
                System.out.println(retorno);
                cont+=1;
            }
            if(cont >= 4) {
                break;
            }
        }
    }
    
    public static String numeroperfeito (int num){
        int i, Sum = 0 ;
        for(i = 1 ; i < num ; i++) {
            if(num % i == 0)  {
                Sum = Sum + i;
            }
        }
        if (Sum == num) {
            return String.valueOf(num) + " é um numero perfeito";
        }
        return "";
    }
}
