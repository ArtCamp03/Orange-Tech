public class App {

    public static void main(String[] args) throws Exception {
        ifFlecha();
        ifElseFlecha();
        switchSemana();
        
    }

    // funçao efeito flecha deve ser evitado
    private static void ifFlecha(){
        int mes = 9;

        if(mes == 1){
            System.out.println("Janeiro");
        }else{
            if(mes == 2){
                System.out.println("Fevereiro");
            }else{
                if(mes == 3){
                    System.out.println("Março");
                }else{
                    if(mes == 4){
                        System.out.println("Abril");
                    }else{
                        if(mes == 4){
                            System.out.println("Maio");
                        }else{
                            if(mes == 4){
                                System.out.println("Junho");
                            }else{
                                if(mes == 4){
                                    System.out.println("Julho");
                                }else{
                                    if(mes == 4){
                                        System.out.println("Agosto");
                                    }else{
                                        if(mes == 4){
                                            System.out.println("Setembro");
                                        }else{
                                            if(mes == 4){
                                                System.out.println("Outubro");
                                            }else{
                                                if(mes == 4){
                                                    System.out.println("Novembro");
                                                }else{
                                                    if(mes == 4){
                                                        System.out.println("Dezembro");
                                                    }else{
                                                       System.out.println("Mes invalido !");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void ifElseFlecha(){
        int mes = 9;

        if(mes == 1){
            System.out.println("Janeiro");
        }else if(mes == 2){
            System.out.println("Fevereiro");
        }else if(mes == 3){
            System.out.println("Março");
        }else if(mes == 4){
            System.out.println("Abril");
        }
    }

    private static void switchSemana(){
        String dia = "Terça";

        switch(dia){
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(2);
                break;
            case "Quarta":
                System.out.println(2);
                break;
            case "Quinta":
                System.out.println(2);
                break;
            case "Sexta":
                System.out.println(2);
                break;
            case "Sabado":
                System.out.println(2);
                break;
            case "Domingo":
                System.out.println(2);
                break;
            default:
                System.out.println(1);
                System.out.println("Dia invalido !");
                break;
        }
    }

}
