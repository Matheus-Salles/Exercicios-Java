public class AnguloObj {

	private double arcRad;
	
	public AnguloObj (double graus) {
		arcRad = graus;
		arcRad = this.converteAngulo();
	}
	public double converteAngulo () {
		return arredondar(Math.toRadians(this.arcRad));
	}
	public double funcaoSeno () {
		return arredondar(Math.sin(this.arcRad));
	}
	public double funcaoCoseno () {
		return arredondar(Math.cos(this.arcRad));
	}
	public double funcaoTangente () {
		return arredondar(Math.tan(this.arcRad));
	}
	public double funcaoCotangente () {
		return arredondar(1/Math.tan(this.arcRad));
	}
	private static double arredondar(double ang) {
		   return Math.round(ang * 100.0)/100.0;
		}
	
	@Override
	public String toString() {
        return "Arco: " + this.arcRad + "\nSeno: " + this.funcaoSeno() +
        		"\nCosseno: " + this.funcaoCoseno() + "\nTangente: " +
        		this.funcaoTangente() + "\nCotangente: " + this.funcaoCotangente() + "\n";
    }
}

