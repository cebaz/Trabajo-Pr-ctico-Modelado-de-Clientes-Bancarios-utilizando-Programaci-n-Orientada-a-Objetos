import java.time.LocalDate;
import Calificaion.CalificacionCliente;
import Enums.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("============== CLIENTES ESTÁNDAR ==============\n");
        
        // Creando Cliente Estándar 1
        ClienteEstandar cliente1 = new ClienteEstandar(1, "Juan", "Perez", 12345678, "Calle Falsa 123", 123456789, "juan.perez@email.com", LocalDate.of(2020, 1, 1), CalificacionCliente.MEDIO, 12345678, LocalDate.of(1990, 5, 15), Profesion.INGENIERO, 500000.0);
        System.out.println("Cliente 1:");
        System.out.println(cliente1);
        System.out.println("Calificación calculada: " + cliente1.calcularCalificacion());
        System.out.println();
        
        // Creando Cliente Estándar 2
        ClienteEstandar cliente2 = new ClienteEstandar(2, "Maria", "Garcia", 87654321, "Avenida Principal 456", 987654321, "maria.garcia@email.com", LocalDate.of(2023, 6, 15), CalificacionCliente.BAJO, 87654321, LocalDate.of(1985, 3, 20), Profesion.DOCENTE, 200000.0);
        System.out.println("Cliente 2:");
        System.out.println(cliente2);
        System.out.println("Calificación calculada: " + cliente2.calcularCalificacion());
        System.out.println();
        
        // Demostrando getters y setters para Cliente Estándar
        System.out.println("--- Modificando datos del Cliente 2 ---");
        cliente2.setNombre("María");
        cliente2.setCorreo("maria.garcia.updated@email.com");
        cliente2.setIngresos(300000.0);
        System.out.println("Nombre actualizado: " + cliente2.getNombre());
        System.out.println("Email actualizado: " + cliente2.getCorreo());
        System.out.println("Ingresos actualizados: " + cliente2.getIngresos());
        System.out.println("Nueva calificación: " + cliente2.calcularCalificacion());
        System.out.println();
        
        
        System.out.println("============== CLIENTES EMPRESA ==============\n");
        
        // Creando Cliente Empresa 1
        ClienteEmpresa clienteEmpresa1 = new ClienteEmpresa(3, "Carlos", "Rodriguez", 11111111, "Calle Comercial 789", 111111111, "carlos@empresatech.com", LocalDate.of(2019, 3, 10), CalificacionCliente.ALTO, "TechSolutions S.A.", 20123456, Rubro.TECNOLOGIA, "Carlos Rodriguez", 1500000.0);
        System.out.println("Empresa 1:");
        System.out.println(clienteEmpresa1);
        System.out.println("Calificación calculada: " + clienteEmpresa1.calcularCalificacion());
        System.out.println();
        
        // Creando Cliente Empresa 2
        ClienteEmpresa clienteEmpresa2 = new ClienteEmpresa(4, "Ana", "Lopez", 22222222, "Ruta Industrial 321", 222222222, "ana@construcciones.com", LocalDate.of(2021, 8, 5), CalificacionCliente.MEDIO, "Construcciones Modernas S.A.", 20987654, Rubro.CONSTRUCCION, "Ana Lopez", 800000.0);
        System.out.println("Empresa 2:");
        System.out.println(clienteEmpresa2);
        System.out.println("Calificación calculada: " + clienteEmpresa2.calcularCalificacion());
        System.out.println();
        
        // Demostrando getters y setters para Cliente Empresa
        System.out.println("--- Modificando datos de Empresa 2 ---");
        clienteEmpresa2.setRazonSocial("Construcciones Modernas e Innovadoras S.A.");
        clienteEmpresa2.setRubro(Rubro.AGROPECUARIO);
        clienteEmpresa2.setIngresos(1200000.0);
        System.out.println("Razón Social actualizada: " + clienteEmpresa2.getRazonSocial());
        System.out.println("Rubro actualizado: " + clienteEmpresa2.getRubro());
        System.out.println("Ingresos actualizados: " + clienteEmpresa2.getIngresos());
        System.out.println("Nueva calificación: " + clienteEmpresa2.calcularCalificacion());
        System.out.println();
        
        
        System.out.println("============== CLIENTES PREFERENCIAL ==============\n");
        
        // Creando Cliente Preferencial 1
        ClientePreferencial clientePref1 = new ClientePreferencial(5, "Roberto", "Martinez", 33333333, "Avenida Ejecutiva 654", 333333333, "roberto@vip.com", LocalDate.of(2018, 2, 20), CalificacionCliente.AVANZADO, 5000000.0, "Gerente Juan Diaz", BeneficioAdicional.TARJETA_BLACK, 2500000.0);
        System.out.println("Cliente Preferencial 1:");
        System.out.println(clientePref1);
        System.out.println("Calificación calculada: " + clientePref1.calcularCalificacion());
        System.out.println();
        
        // Creando Cliente Preferencial 2
        ClientePreferencial clientePref2 = new ClientePreferencial(6, "Laura", "Sanchez", 44444444, "Boulevard Premium 987", 444444444, "laura@premium.com", LocalDate.of(2022, 5, 12), CalificacionCliente.ALTO, 3000000.0, "Ejecutivo Pedro Gomez", BeneficioAdicional.INVERSIONES_ADMINISTRADAS, 1800000.0);
        System.out.println("Cliente Preferencial 2:");
        System.out.println(clientePref2);
        System.out.println("Calificación calculada: " + clientePref2.calcularCalificacion());
        System.out.println();
        
        // Demostrando getters y setters para Cliente Preferencial
        System.out.println("--- Modificando datos del Cliente Preferencial 2 ---");
        clientePref2.setEjecutivoCuentaAsignado("Ejecutivo Luis Fernandez");
        clientePref2.setBeneficiosAdicionales(BeneficioAdicional.CAJA_SEGURIDAD);
        clientePref2.setLimiteCreditoEspecial(4000000.0);
        clientePref2.setIngresos(2200000.0);
        System.out.println("Ejecutivo actualizado: " + clientePref2.getEjecutivoCuentaAsignado());
        System.out.println("Beneficio actualizado: " + clientePref2.getBeneficiosAdicionales());
        System.out.println("Límite de crédito: " + clientePref2.getLimiteCreditoEspecial());
        System.out.println("Ingresos actualizados: " + clientePref2.getIngresos());
        System.out.println("Nueva calificación: " + clientePref2.calcularCalificacion());
        System.out.println();
    }
}
