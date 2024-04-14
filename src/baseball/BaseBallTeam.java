package baseball;

public class BaseBallTeam {
	    // フィールド
	    private String baseballName;// 球団名
	    private int win;// 勝利数
	    private int lose;// 敗北数
	    private int draw;// 引分数
	    
	    // コンストラクタ
	    public BaseBallTeam() {
	    }

	    // 引数ありコンストラクタ
	    public  BaseBallTeam(String baseballName, int win, int lose,int draw) {
	        System.out.println("初期化時に引数ありコンストラクタが呼ばれました");
	        this.baseballName = baseballName;
	        this.win = win;
	        this.lose = lose;
	        this.draw = draw;
	    }
	    
		public String getBaseballName() {
			return baseballName;
		}
		public void setBaseballName(String baseballName) {
			this.baseballName = baseballName;
		}
		public double getWin() {
			return win;
		}
		public void setWin(int win) {
			this.win = win;
		}
		public double getLose() {
			return lose;
		}
		public void setLose(int lose) {
			this.lose = lose;
		}
		public int getDraw() {
			return draw;
		}
		public void setDraw(int draw) {
			this.draw = draw;
		}
		
		//勝率：勝ち数/(勝ち数+負け数)のメソッド
		public double getRate(int win,int lose) {
		double rate  = (double)( this.win / (this. win + this. lose ));
		return rate;
		}

		//setterなしでも行ける？
		//○○ の2022年の成績は △△勝 □□敗 ☆☆分、勝率は 0.▽▽▽▽▽▽です。と表示するメソッド
		public void report() {
		double rate = getRate(this.win, this.lose);
		System.out.println(this.baseballName + "の2022年の成績は" + this.win +"勝" + this.lose +"敗" + this.draw +"分、勝率は" + rate + "です。");

		}
}