package baseball;

public class Review03 {

	public static void main(String[] args) {
		// セリーグの2022戦績
		BaseBallTeam yakuruto = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
		BaseBallTeam dena = new BaseBallTeam("横浜DeNaベイスターズ",73,68,2);
		BaseBallTeam tigers = new BaseBallTeam("阪神タイガース",68,71,4);
		BaseBallTeam giants = new BaseBallTeam("読売ジャイアンツ",68,72,3);
		BaseBallTeam carps = new BaseBallTeam("広島東洋カープ",66,74,3);
		BaseBallTeam doragons = new BaseBallTeam("中日ドラゴンズ",66,75,2);
		
		//reportメソッドを呼び出して、勝敗情報を表示してください
		yakuruto.report();
		dena.report();
		tigers.report();
		giants.report();
		carps.report();
		doragons.report();

	}

}
