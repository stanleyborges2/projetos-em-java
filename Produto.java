public class Produto{
        public static void main(String[] args) {
            

        static int ultimoId = 0;
        private int id;
        private String nome;
        private double preco;
        
        public Produto() {
                    this.id = ++ultimoId;
                    this.nome = "";
                    this.preco = 0.0;
                }
    } 
        
        public Produto(String nome, double preco) {
            this();
            this.nome = nome;
            this.preco = preco;

        }

        public int getId(){
            return id;

        }

        public String getNome(){
            return nome;
        }


        public void setNome(String nome){
            this.nome = nome;
        }

        public double getPreco(){
            return preco;
        }

        public void setPreco(double preco) {
            if (preco >= 0) {
                this.preco = preco;
            } else {
                this.preco = 0;
            }
        }
}

           
        