package Shape;

public class ShapePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle lingkaran = new Circle();
		Parallelogram jg = new Parallelogram();
		Rectangle spanjang = new Rectangle();
		Rhombus bketupat = new Rhombus();
		Square persegi = new Square();
		Triangle stiga = new Triangle();
		
		lingkaran.setCircle(4);
		jg.setParallelogram(3, 4);
		spanjang.setRectangle(6, 7);
		bketupat.setRhombus(10, 8);
		persegi.setSquare(5);
		stiga.setTriangel(5, 2);
		
		System.out.println("Luas Lingkaran			:"+lingkaran.getCircle());
		System.out.println("Luas Jajar Genjang		:"+jg.getParallelogram());
		System.out.println("Luas Persegi Panjang		:"+spanjang.getRectangle());
		System.out.println("Luas Belah Ketupat		:"+bketupat.getRhombus());
		System.out.println("Luas Persegi			:"+persegi.getSquare());
		System.out.println("Luas Segitiga			:"+stiga.getTriangle());
	}

}
