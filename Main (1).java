class Main {
  //cria um metodo(sem parametro)
  static void imPrime(){
    System.out.println("Só imprime isso");
  }
  
  //aqui cria um método passando parametro
   static void meuMetodo(String nome) {
    System.out.println("O nome é: "+ nome);
  }

  //aqui cria um método passando parametro
   static void nomeEidade(String nome, int ano) {
    System.out.println(nome + " tem "+ ano + "anos");
  }

  //crie um metodo chamado exib que exibe uma String na tela
  
  //classe principal do java
  public static void main (String[] args){
    //chama metodo imPrime()
    imPrime();

    //chama metodo meuMetodo()
    meuMetodo("Giovanna");
    meuMetodo("Isabelly");
    meuMetodo("Thaiany");

    //metodo com dois parametros
    nomeEidade("Giovanna", 17);
    nomeEidade("Isabelly", 17);
    nomeEidade("Thaiany", 18);

  }
  
}