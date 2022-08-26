package bigworkers.ingresoegreso.ferreteria;

import bigworkers.ingresoegreso.ferreteria.entity.Enterprise;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FerreteriaApplication {

	public static void main(String[] args) {SpringApplication.run(FerreteriaApplication.class, args);}{

		//PRUEBA PARA CREAR UNA INSTANCIA DE LA CLASE ENTERPRISE

		//CREAR EMPRESA USANDO EL CONSTRUCTOR DE LA CLASE
		Enterprise empresa = new Enterprise(123456789,"Ferreteria la tuerca","12992999","Carrera 25 # 10-80","601235645");

		//OBTENER LOS DATOS DE LA EMPRESA
		System.out.println(empresa.toString());

		//MODIFICAR DATOS DE LA EMPRESA CREADA
		empresa.setName("Ferreteria tornillo");
		empresa.setAddress("Calle 2 # 10-20");
		empresa.setDocument("12000000");
		empresa.setPhone("3101234566");

		//OBTENER LOS NUEVOS DATOS DE LA EMPRESA
		System.out.println(empresa.toString());

	}

}
