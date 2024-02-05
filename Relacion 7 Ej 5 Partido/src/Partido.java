import java.util.Scanner;

public class Partido {
	public static Scanner teclado=new Scanner(System.in);
	
	public static final int MINIMO_JORNADA = 1;
	public static final int MAXIMO_JORNADA = 38;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int golesEquipoLocal;
	private int golesEquipoVisitante;
	private int jornada;
	private char quiniela='1';
	private boolean jugado;

	public Partido(Equipo equipoLocal, Equipo equipoVisitante, int jornada) throws PartidoException {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.jornada = jornada;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public int getGolesEquipoLocal() throws PartidoException {
		if (jugado) {
			return golesEquipoLocal;
		} else {
			throw new PartidoException("Partido no jugado");
		}
	}

	public int getGolesEquipoVisitante() throws PartidoException {
		if (jugado) {
			return golesEquipoVisitante;
		} else {
			throw new PartidoException("Partido no jugado");
		}
	}

	public char getQuiniela() throws PartidoException {
		if (jugado) {
			if (golesEquipoLocal > golesEquipoVisitante) {
				quiniela = '1';
			} else {
				if (golesEquipoLocal < golesEquipoVisitante) {
					quiniela = '2';
				} else {
					quiniela = 'X';
				}
			}
			return quiniela;
		} else {
			throw new PartidoException("Partido no jugado");
		}
	}

	public int getJornada(){
		return jornada;
	}
	
	public void setJugado(boolean seHaJugado) {
		jugado=seHaJugado;
	}
	public void ponerResultado() {
		System.out.print("Introduce los goles del equipo local: ");
		golesEquipoLocal=Integer.parseInt(teclado.nextLine());
		System.out.print("Introduce los goles del equipo visitante: ");
		golesEquipoVisitante=Integer.parseInt(teclado.nextLine());
	}

	public String toString() {
		return "Equipos: " + equipoLocal.getNombreEquipo() + " // " + equipoVisitante.getNombreEquipo() + "\nGoles: " + golesEquipoLocal + " - "
				+ golesEquipoVisitante + "\nJornada: " + jornada + "\nQuiniela: " + quiniela;
	}

}
