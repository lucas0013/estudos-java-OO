package professor;

public class ProfessorDedicado extends Professor {
        
        //atributos
        private float salarioBruto;

        //getters e setters
        public void setSalarioBruto(float salarioBruto) {
                this.salarioBruto = salarioBruto; 
        }
        public double getSalarioBruto( ) {
                return salarioBruto; 
        }

        //m�todo
        public double calculaSalario( ) {
                return(getSalarioBruto( ) - super.getDesconto() );
        }
}//fim classe




