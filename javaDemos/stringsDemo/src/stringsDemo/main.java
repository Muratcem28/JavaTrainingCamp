package stringsDemo;

public class main {

	public static void main(String[] args) {


String message = "Bugün hava çok güzel.";
System.out.println(message);

System.out.println("Eleman sayısı : " + message.length());

System.out.println("5. eleman : " + message.charAt(4));
System.out.println(message.concat(" Yaşasın!")); 	// concatenate(concat) = birleştirmek
System.out.println(message);						// --> bugün hava çok güzel Yaşasın!

System.out.println(message.startsWith("B"));		// --> B ile başlıyorsa true döndürür yoksa false.(büyük küçük olması önemli!!)
System.out.println(message.endsWith("B"));			//--> B ile bitiyorsa true döndürür yoksa false.

char[] characters = new char[5];
message.getChars(0,5,characters,0); 				// 0 dan 5 e kadar karakterler dizisinden 0 dan başlayarak atama yap.
System.out.println(characters); 					// az kullanılan bir yöntem.

System.out.println(message.indexOf("av")); 			//--> ilk bulduğu a nın index ini verir.
System.out.println(message.lastIndexOf('a')); 		// --> sondan başlar fakat baştan başlamış gibi indexini söyler!!!
													// kullanımları yaygındır.

System.out.println("-------------------------------------------Video2");
String newMessage = message.replace(' ','-');		//replace kullanımında değişiklik kalıcı olur.
System.out.println(newMessage); 					// yada
System.out.println(message.replace(' ','-'));		// --> replace = yer değiştirmek -> boşluk gelen yerlere - gelecek.

System.out.println(message.substring(2));			// mesajin 2.indisinden itibaren ekrana yaz
System.out.println(message.substring(2,4)); 			//2 den başla 4 e kadar(4 dahil değil) yaz.


for(String word : message.split(" ")){
	System.out.println(word); 				//-->> bütün kelimeleri tek tek yazdırır. String de ki boşluklara göre kelimeleri ayırır.
}

System.out.println(message.toLowerCase());			//lower case == küçük harf --> hepsini küçük harf yapar.

System.out.println(message.toUpperCase());			// upper case == büyük harf --> hepsini büyük harf yapar.

													//lower ve upper i genellikle veritabanına arama ifadesi gönderdiğimizde kullanırız !!!

System.out.println(message.trim()); 				//string ifadenin başında ve sonundaki boşlukları atar.


	}

}
