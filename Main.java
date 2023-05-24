import java.util.Scanner;
import java.text.DateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
    	class Data {
            private int pergunteLimitado(int n1, int n2, String prompt) {
                Scanner pergunte = new Scanner(System.in);
                System.out.print(prompt);
                int val = pergunte.nextInt();
                while (val < n1 || val > n2) {
                    System.out.print("Digite novamente: ");
                    val = pergunte.nextInt();
                }
                return val;
            }
            
            private String[] meses = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
            private Scanner pergunte = new Scanner(System.in);
                    
            private int dia;
            private int mes;
            private int ano;
            
            Data() {
                this.dia = pergunteLimitado(1, 31, "Dia: ");
                this.mes = pergunteLimitado(1, 12, "Mes: ");
                System.out.print("Ano: ");
                this.ano = pergunte.nextInt();
            }
            Data(int d, int m, int a) {
                this.dia = d;
                this.mes = m;
                this.ano = a;
            }
            void entraDia(int d) {
                this.dia = d;
            }
            void entraMes(int m) {
                this.mes = m;
            }
            void entraAno(int a) {
                this.ano = a;
            }
            void entraDia() {
                this.dia = pergunteLimitado(1, 31, "Dia: ");
            }
            void entraMes() {
                this.mes = pergunteLimitado(1, 12, "Mes: ");
            }
            void entraAno() {
                System.out.print("Ano: ");
                this.ano = pergunte.nextInt();
            }
            int retDia() {
                return this.dia;
            }
            int retMes() {
                return this.mes;
            }
            int retAno() {
                return this.ano;
            }
            String mostra1() {
                return (Integer.toString(this.dia) + "/" +  Integer.toString(this.mes) + "/" +  Integer.toString(this.ano));
            }
            String mostra2() {
                return (Integer.toString(this.dia) + "/" +  meses[this.mes - 1] + "/" +  Integer.toString(this.ano));
            }
            boolean bissexto() {
                return (this.ano % 4 == 0);
            }
            int diasTranscorridos() {
                return (((this.mes - 1) * 30) + this.dia);
            }
            void apresentaDataAtual () {
                DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.FULL);
                Date myDate = new Date();
                myDate.setYear(this.ano);
                myDate.setMonth(this.mes);
                myDate.setDate(this.dia);
                System.out.println(dateFormat.format(myDate));
            }
        }
        
        System.out.println("Sem parametros iniciais: ");
        Data data1 = new Data();
        System.out.println(data1.mostra1());
        System.out.println(data1.mostra2());
        System.out.println(data1.diasTranscorridos());
        data1.apresentaDataAtual();
        System.out.println(data1.bissexto());
        System.out.println("Mudando valores: ");
        data1.entraAno();
        data1.entraMes();
        data1.entraDia();
        System.out.println(data1.retAno());
        System.out.println(data1.retMes());
        System.out.println(data1.retDia());
        
        System.out.println("Com parametros iniciais: ");
        data1 = new Data(22, 05, 2004);
        System.out.println(data1.mostra1());
        System.out.println(data1.mostra2());
        System.out.println(data1.diasTranscorridos());
        data1.apresentaDataAtual();
        System.out.println(data1.bissexto());
        System.out.println("Mudando valores: ");
        data1.entraAno();
        data1.entraMes();
        data1.entraDia();
        System.out.println(data1.retAno());
        System.out.println(data1.retMes());
        System.out.println(data1.retDia());
	}
}
