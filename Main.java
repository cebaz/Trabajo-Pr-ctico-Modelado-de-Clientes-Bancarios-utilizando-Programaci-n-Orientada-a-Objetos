public class Main {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente(2, "Maria", "Garcia", "Individual", true);
        //
        cliente1.setId(1);
        cliente1.setNombre("Juan");
        cliente1.setApellido("Perez");
        cliente1.setTipo("Individual");
        cliente1.setActivo(true);
        System.out.println("Cliente 1:");
        System.out.println(cliente1);
        System.out.println("Cliente 2:");
        System.out.println(cliente2);
        
        if (cliente1.getActivo() == true){
            System.out.println("El cliente 1 esta activo");
        }
        if (cliente2.getActivo() == true){
            System.out.println("El cliente 2 esta activo");
        }
    }
}
