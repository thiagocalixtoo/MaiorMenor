import java.util.Scanner;

    public class Exe08 {        // ler 10 numeros e listar o maior e o menor

        public static void main (String []args){

            Scanner scanner = new Scanner (System.in);

            double valorvariavel;
            double maior;
            double menor;
            int cont1 = 0;
            int cont2 = 1;

            System.out.print("Digite o " + cont2 + "° número: ");   // pedindo o primeiro valor, que deve estar fora do while
                    valorvariavel = scanner.nextDouble();
                    menor = valorvariavel;
                    maior = valorvariavel;

                cont1++;
                cont2++;       // contadores

                    while(cont1 >= 0 && cont1 < 10){      // repetição      

                        System.out.print("Digite o " + cont2 + "° número: ");
                        valorvariavel = scanner.nextDouble();

                            if(valorvariavel > maior){
                                maior = valorvariavel;      // maior
                            }

                            if(valorvariavel < menor){
                                menor = valorvariavel;      // menor
                            }
                            
                        cont1++;
                        cont2++;        //contadores
                    }

            scanner.close();     
            
                                        // saida:
            System.out.println("\n        =======================\nO maior número foi "+ maior +" e o menor foi "+ menor +"\n        =======================\n");

        }
    }
    