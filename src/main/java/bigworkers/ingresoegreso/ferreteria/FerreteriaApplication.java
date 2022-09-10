package bigworkers.ingresoegreso.ferreteria;

import bigworkers.ingresoegreso.ferreteria.entity.Enterprise;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FerreteriaApplication {

	public static void main(String[] args) {SpringApplication.run(FerreteriaApplication.class, args);}{

		/*
		//PRUEBA PARA CREAR UNA INSTANCIA DE LA CLASE ENTERPRISE////////////////////////////////////////////////////////

		//CREAR EMPRESA USANDO EL CONSTRUCTOR DE LA CLASE
		Enterprise empresa = new Enterprise(123456789,"Ferreteria la tuerca",
				"12992999","Carrera 25 # 10-80","601235645");

		//OBTENER LOS DATOS DE LA EMPRESA
		System.out.println("\n"+empresa.toString());

		//MODIFICAR DATOS DE LA EMPRESA CREADA
		empresa.setName("Ferreteria tornillo");
		empresa.setAddress("Calle 2 # 10-20");
		empresa.setDocument("12000000");
		empresa.setPhone("3101234566");

		//OBTENER LOS NUEVOS DATOS DE LA EMPRESA
		System.out.println("Datos modificados:\n"+
				"Nombre: "+empresa.getName()+"\n"+
				"Direccion: "+empresa.getAddress()+"\n"+
				"Documento: "+empresa.getDocument()+"\n"+
				"Telefono: "+empresa.getPhone()+"\n");


		//PRUEBA PARA CREAR UNA INSTANCIA DE LA CLASE EMPLOYEE//////////////////////////////////////////////////////////

		//CREAR EMPLEADO USANDO EL CONSTRUCTOR DE LA CLASE
		Employee empleado = new Employee(1,"CC",
				"12999999","Carlos","Rueda","Calle 2 # 3-15",
				"3124561211","carlos@gmail.com",25,"Operativo","Ferreteria la tuerca",true);

		//OBTENER LOS DATOS DEL EMPLEADO
		System.out.println(empleado.toString());

		//MODIFICAR DATOS DE LA EMPLEADO CREADO
		empleado.setName("Andres");
		empleado.setEmail("andres@gmail.com");
		empleado.setEnterprise("Ferreteria tornillo");
		empleado.setRole("Administrador");

		//OBTENER LOS NUEVOS DATOS DEL EMPLEADO
		System.out.println("Datos modificados:\n"+
				"Nombre: "+empleado.getName()+"\n"+
				"Email: "+empleado.getEmail()+"\n"+
				"Empresa: "+empleado.getEnterprise()+"\n"+
				"Rol: "+empleado.getRole()+"\n");


		//PRUEBA PARA CREAR UNA INSTANCIA DE LA CLASE TRANSACTION///////////////////////////////////////////////////////

		//CREAR MOVIMIENTO USANDO EL CONSTRUCTOR DE LA CLASE
		Transaction movimiento = new Transaction(1,"Venta",250000,"Andres");


		//OBTENER LOS DATOS DEL MOVIMIENTO
		System.out.println(movimiento.toString());

		//MODIFICAR DATOS DEL MOVIMIENTO CREADO
		movimiento.setAmount(100000);
		movimiento.setAmount(200000);
		movimiento.setAmount(-200000);
		movimiento.setConcept("Gasto");
		movimiento.setUser("Carlos");

		//OBTENER LOS NUEVOS DATOS DEL MOVIMIENTO
		System.out.println("Datos modificados:\n"+
				"Monto: "+movimiento.getAmount()+"\n"+
				"Concepto: "+movimiento.getConcept()+"\n"+
				"Usuario: "+movimiento.getUser()+"\n");

		*/
	}


    public static interface IEnterpriseService {

        public Enterprise findById(Long id);
        public List<Enterprise> findAll();
        public Enterprise createEnterprise(Enterprise empresa);
        public Enterprise updateEnterprise(long id, Enterprise empresa);
        public void deleteEnterprise(long id);

        }
}
