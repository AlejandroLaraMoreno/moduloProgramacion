import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Equipo equipo1 = new Equipo("sggsgere", "jfsiioihofsefshio", "hioefhifeihfes");
		Equipo equipo2 = new Equipo("ihsoihfh", "kfsfiehfoihoefoih", "orihuheru");
		try {
			Partido partido = new Partido(equipo1, equipo2, 2);
			partido.setJugado(true);
			System.out.println(partido);
		} catch (PartidoException e) {

		}
	}

}
