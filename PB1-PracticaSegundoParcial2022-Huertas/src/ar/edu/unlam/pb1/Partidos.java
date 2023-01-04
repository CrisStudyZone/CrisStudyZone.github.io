package ar.edu.unlam.pb1;

public class Partidos {
	
	private static String selecciones[] = {"Qatar", "Ecuador", "Senegal", "Paises Bajos", "Inglaterra", "Ir�n", "EEUU", "Gales", "Argentina", "Arabia Saudita", "M�xico", "Polonia", "Francia", "Australia", "Dinamarca", "Tunez", "Espa�a", "Costa Rica", "Alemania", "Jap�n", "B�lgica", "Canad�", "Marruecos", "Croacia", "Brasil", "Serbia", "Suiza", "Camer�n", "Portugal", "Ghana", "Uruguay", "Corea del Sur"};
	private static String ronda []= {"Face de grupos", "Octavos de final", "Cuartos de final", "Semifinal", "Final"};
	private char grupo [] = {'A', 'B','C','D','E','F','G','H'};
	
	public void resultadoSorteoDePartidos (String selecciones [],char grupo []) {
		this.selecciones=selecciones;
		this.grupo=grupo;
		while (grupo.equals('A')) {
			selecciones.equals("Qatar");
			selecciones.equals("Ecuador");
			selecciones.equals("Senegal");
			selecciones.equals("Paises Bajos");
			break;			
		}
		while (grupo.equals('B')) {
			selecciones.equals("Inglaterra");
			selecciones.equals("Iran");
			selecciones.equals("EEUU");
			selecciones.equals("Gales");
			break;			
		}
		while (grupo.equals('C')) {
			selecciones.equals("Argentina");
			selecciones.equals("Arabia Saudita");
			selecciones.equals("Mexico");
			selecciones.equals("Polonia");
			break;			
		}
		while (grupo.equals('D')) {
			selecciones.equals("Francia");
			selecciones.equals("Australia");
			selecciones.equals("Dinamarca");
			selecciones.equals("Tunez");
			break;			
		}
		while (grupo.equals('E')) {
			selecciones.equals("España");
			selecciones.equals("Costa Rica");
			selecciones.equals("Alemania");
			selecciones.equals("Polonia");
			break;			
		}
		while (grupo.equals('F')) {
			selecciones.equals("Belgica");
			selecciones.equals("Canada");
			selecciones.equals("Marruecos");
			selecciones.equals("Croacia");
			break;			
		}
		while (grupo.equals('G')) {
			selecciones.equals("Brasil");
			selecciones.equals("Serbia");
			selecciones.equals("Suiza");
			selecciones.equals("Camerun");
			break;			
		}
		while (grupo.equals('H')) {
			selecciones.equals("Portugal");
			selecciones.equals("Ghana");
			selecciones.equals("Uruguay");
			selecciones.equals("Corea del Sur");
			break;			
		}
		
	}
	
	
	public String getFaceDeGrupos() {
		return "Fecha 1 de la fase de grupos del Mundial Qatar 2022\r\n"
		+ "Domingo 20 de noviembre 13:00hs\r\n"
		+ "\r\n"
		+ selecciones// vs Ecuador - GRUPO A\r\n"
		+ "\r\n"
		+ "Lunes 21 de noviembre\r\n"
		+ "\r\n"
		+ "10:00 Inglaterra vs Irán - GRUPO B\r\n"
		+ "\r\n"
		+ "13:00 Senegal vs Países Bajos – GRUPO A\r\n"
		+ "\r\n"
		+ "16:00 Estados Unidos vs Gales - GRUPO B\r\n"
		+ "\r\n"
		+ "Martes 22 de noviembre\r\n"
		+ "\r\n"
		+ "7:00 Argentina vs Arabia Saudita - GRUPO C\r\n"
		+ "\r\n"
		+ "10:00 Dinamarca vs Túnez - GRUPO C\r\n"
		+ "\r\n"
		+ "13:00 México vs Polonia - GRUPO D\r\n"
		+ "\r\n"
		+ "16:00 Francia vs Australia - GRUPO D\r\n"
		+ "\r\n"
		+ "Miércoles 23 de noviembre\r\n"
		+ "\r\n"
		+ "7:00 Marruecos vs Croacia - GRUPO F\r\n"
		+ "\r\n"
		+ "10:00 Alemania vs Japón - GRUPO E\r\n"
		+ "\r\n"
		+ "13:00 España vs Costa Rica - GRUPO E\r\n"
		+ "\r\n"
		+ "16:00 Bélgica vs Canadá - GRUPO F\r\n"
		+ "\r\n"
		+ "Jueves 24 de noviembre\r\n"
		+ "\r\n"
		+ "7:00 Suiza vs Camerún - GRUPO G\r\n"
		+ "\r\n"
		+ "10:00 Uruguay vs Corea del Sur - GRUPO H\r\n"
		+ "\r\n"
		+ "13:00Portugal vs Ghana - GRUPO H\r\n"
		+ "\r\n"
		+ "16:00 Brasil vs Serbia - GRUPO G\r\n"
		+ "\r\n"
		+ "Fecha 2 de la fase de grupos del Mundial Qatar 2022\r\n"
		+ "Viernes 25 de noviembre\r\n"
		+ "\r\n"
		+ "7:00 Gales vs Irán - GRUPO B\r\n"
		+ "\r\n"
		+ "10:00 Qatar vs Senegal - GRUPO A\r\n"
		+ "\r\n"
		+ "13:00 Países Bajos vs Ecuador - GRUPO A\r\n"
		+ "\r\n"
		+ "16:00 Inglaterra vs Estados Unidos GRUPO B\r\n"
		+ "\r\n"
		+ "Sábado 26 de noviembre\r\n"
		+ "\r\n"
		+ "7:00 Túnez vs Australia - GRUPO D\r\n"
		+ "\r\n"
		+ "10:00 Polonia vs Arabia Saudita - GRUPO C\r\n"
		+ "\r\n"
		+ "13:00 Francia vs Dinamarca - GRUPO D\r\n"
		+ "\r\n"
		+ "16:00 Argentina vs México - GRUPO C\r\n"
		+ "\r\n"
		+ "Domingo 27 de noviembre\r\n"
		+ "\r\n"
		+ "7:00 Japón vs Costa Rica - GRUPO E\r\n"
		+ "\r\n"
		+ "10:00 Bélgica vs Marruecos - GRUPO F\r\n"
		+ "\r\n"
		+ "13:00 Croacia vs Canadá - GRUPO F\r\n"
		+ "\r\n"
		+ "16:00 España vs Alemania - GRUPO E\r\n"
		+ "\r\n"
		+ "Lunes 28 de noviembre\r\n"
		+ "\r\n"
		+ "7:00 Camerún vs Serbia - GRUPO G\r\n"
		+ "\r\n"
		+ "10:00 Corea vs Ghana - GRUPO H\r\n"
		+ "\r\n"
		+ "13:00 Brasil vs Suiza - GRUPO G\r\n"
		+ "\r\n"
		+ "16:00 Portugal vs Uruguay - GRUPO H\r\n"
		+ "\r\n"
		+ "Fecha 3 de la fase de grupos del Mundial Qatar 2022\r\n"
		+ "Martes 29 de noviembre\r\n"
		+ "\r\n"
		+ "12:00 Países Bajos vs Qatar - GRUPO A\r\n"
		+ "\r\n"
		+ "12:00 Ecuador vs Senegal - GRUPO A\r\n"
		+ "\r\n"
		+ "16:00 Gales vs Inglaterra - GRUPO B\r\n"
		+ "\r\n"
		+ "16:00 Irán vs Estados Unidos GRUPO B\r\n"
		+ "\r\n"
		+ "Miércoles 30 de noviembre\r\n"
		+ "\r\n"
		+ "12:00 Túnez vs Francia - GRUPO D\r\n"
		+ "\r\n"
		+ "12:00 Australia vs Dinamarca - GRUPO D\r\n"
		+ "\r\n"
		+ "16:00 Polonia vs Argentina - GRUPO C\r\n"
		+ "\r\n"
		+ "16:00 Arabia Saudita vs México - GRUPO C\r\n"
		+ "\r\n"
		+ "Jueves 1° de diciembre\r\n"
		+ "\r\n"
		+ "12:00 Croacia vs Bélgica - GRUPO F\r\n"
		+ "\r\n"
		+ "12:00 Canadá vs Marruecos - GRUPO F\r\n"
		+ "\r\n"
		+ "16:00 Japón vs España - GRUPO E\r\n"
		+ "\r\n"
		+ "16:00 Costa Rica vs Alemania - GRUPO E\r\n"
		+ "\r\n"
		+ "Viernes 2 de diciembre\r\n"
		+ "\r\n"
		+ "12:00 Corea vs Portugal - GRUPO H\r\n"
		+ "\r\n"
		+ "12:00 Ghana vs Uruguay - GRUPO H\r\n"
		+ "\r\n"
		+ "16:00 Camerún vs Brasil - GRUPO G\r\n"
		+ "\r\n"
		+ "16:00 Serbia vs Suiza - GRUPO G\r\n"
		+ "\r\n"
		+ "";
	}
	
}
