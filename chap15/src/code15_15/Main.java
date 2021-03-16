package code15_15;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		//LocalDateTimeの生成方法
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);

		//LocalDateTimeとZonedDateTimeの相互変換
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println(l1);

		//InstantとZonedDateTimeの相互変換
		Instant i1 = z1.toInstant();
		ZonedDateTime z2 = i1.atZone(ZoneId.of("Asia/Tokyo"));
		ZonedDateTime z3 = l2.atZone(ZoneId.of("Asia/Tokyo"));

		//LocalDateTimeからZonedDateTimeに変換（ロンドン時間）
		System.out.println(z1);

		//ZonedDateTimeからZonedDateTimeでロンドン時間から東京時間に
		System.out.println(z2);

		//LocalDateTimeからZonedDateTimeに変換（東京時間）
		System.out.println(z3);

		//LocalDateTimeからZonedDateTimeに変換（タイムゾーン削除）
		System.out.println(l3);
	}
}
