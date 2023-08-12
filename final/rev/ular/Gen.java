import java.util.ArrayList;
import java.util.Random;

public class Gen {
    private Random random;
    private int[] p = { 0, 126, 455, 126, 480, 1, 111, 465, 30, 60, 90, -62, 1, 136, 460, 20, 50, 10, 100, 1, 146, 472,
            15, 7, 90, 180, 1, 159, 465, 15, 15, 60, 240, 0, 176, 455, 176, 480, 0, 176, 470, 186, 465, 0, 179, 469,
            186, 480, 1, 193, 440, 20, 40, 180, 90, 0, 193, 467, 203, 467, 1, 206, 466, 14, 14, 0, 360, 0, 237, 455,
            237, 480, 1, 225, 465, 15, 15, 80, 200, 1, 238, 460, 20, 50, 10, 100, 1, 248, 472, 15, 7, 90, 180, 1, 253,
            442, 20, 50, 0, -100, 1, 263, 455, 15, 25, 180, 90, 1, 283, 450, 10, 30, 90, 180, 1, 279, 464, 4, 3, 0, 360,
            1, 291, 465, 15, 15, 60, 240, 1, 306, 466, 14, 14, 0, 360, 1, 324, 466, 14, 14, 0, 360, 0, 343, 455, 343,
            480, 0, 348, 479, 358, 479, 1, 354, 442, 20, 50, 0, -100, 1, 364, 455, 15, 25, 180, 90, 1, 377, 466, 14, 14,
            0, 360, 1, 392, 452, 10, 28, 180, 180, 0, 406, 465, 406, 480, 1, 406, 465, 15, 4, 90, 90, 0, 416, 479, 426,
            479, 0, 431, 465, 431, 480, 1, 431, 465, 7, 30, 0, 120, 1, 437, 465, 7, 30, 0, 120, 1, 448, 466, 14, 14, 0,
            360, 0, 126, 505, 126, 520, 1, 126, 505, 7, 30, 0, 120, 1, 132, 505, 7, 30, 0, 120, 0, 144, 519, 154, 519,
            0, 158, 505, 158, 520, 1, 158, 505, 7, 30, 0, 120, 1, 164, 505, 7, 30, 0, 120, 1, 174, 492, 10, 28, 180,
            180, 1, 188, 505, 12, 7, 270, -220, 1, 188, 512, 12, 8, 90, -220, 1, 200, 480, 20, 40, 180, 90, 0, 200, 507,
            210, 507, 0, 215, 519, 225, 519, 0, 230, 495, 230, 520, 1, 226, 505, 15, 15, 110, -220, 1, 245, 505, 15, 15,
            10, 290, 0, 247, 512, 258, 512, 0, 263, 519, 273, 519, 0, 278, 505, 278, 530, 1, 274, 505, 15, 15, 110,
            -220, 0, 294, 505, 294, 520, 1, 294, 505, 15, 4, 90, 90, 1, 303, 506, 14, 14, 0, 360, 1, 320, 492, 10, 28,
            180, 180, 0, 343, 495, 343, 520, 1, 331, 505, 15, 15, 80, 200, 0, 347, 519, 360, 519, 1, 362, 506, 14, 14,
            0, 360, 1, 380, 505, 15, 50, 90, 90, 0, 380, 515, 387, 515, 0, 390, 519, 400, 519, 1, 394, 482, 20, 50, 0,
            -100, 1, 404, 495, 15, 25, 180, 90, 1, 419, 506, 14, 14, 0, 360, 1, 438, 492, 10, 28, 180, 180, 1, 447, 490,
            10, 30, 90, -180, 1, 457, 504, 4, 3, 0, 360 };
    private ArrayList<Integer> enc;

    Gen() {
        random = new Random(69);
        enc = new ArrayList<Integer>();
    }

    public void ranran() {
        for (int i = 0; i < rad95("comp"); i++) {
            random.nextInt();
            random.nextInt();
        }
        random.nextInt();
        random.nextInt();
    }

    public int rad95(String val) {
        int key = 0, exp = 1;
        for (int i = val.length() - 1; i >= 0; i--) {
            key += (val.charAt(i) - 32) * exp;
            exp *= 95;
        }
        return key;
    }

    public void gf() {
        for (int i = 0; i < p.length; i++) {
            enc.add(p[i] ^ random.nextInt());
        }
    }

    public void trav() {
        for (int el : enc) {
            System.out.print(el + ", ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Gen gen = new Gen();
        gen.ranran();
        gen.gf();
        gen.trav();
        System.out.println(gen.rad95("comp"));
    }
}