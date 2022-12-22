



 /*
	              Bilgisayar biliminde kümeler.
	 Bilgisayar biliminde, küme, benzersiz değerlerin sırasız bir koleksiyonunu depolayacak soyut bir veri türüdür.
	 Birçok programlama dilinde kümeler, dizilere veya sözlüklere benzer yerleşik veri yapıları olarak uygulanır.


	                          STATİK KüMELER:
	     Bir statik küme yapısı S tarafından sağlanabilecek tipik işlemler şunlardır:
   is_element_of(x,S): x değerinin S kümesinde olup olmadığını kontrol eder .
   is_empty(S): S kümesinin boş olup olmadığını kontrol eder.
   size(S)veya : S içindeki öğelerin sayısını döndürür .cardinality(S)
   iterate(S): her aramada, rastgele bir sırada bir S değeri daha döndüren bir işlev döndürür .
   enumerate(S): S'nin öğelerini keyfi bir sırada içeren bir liste döndürür.
   build(x1,x2,…,xn,): x 1 , x 2 ,..., x n değerlerine sahip bir küme yapısı oluşturur .
   create_from(collection): verilen koleksiyonun tüm öğelerini veya verilen yineleyici tarafından döndürülen tüm öğeleri içeren yeni bir küme yapısı oluşturur.


                                DİNAMİK KÜMELER:
         Dinamik küme yapıları genellikle şunları ekler:
   create(): yeni, başlangıçta boş bir küme yapısı oluşturur.
   create_with_capacity(n): başlangıçta boş olan ancak n öğeye kadar tutabilen yeni bir küme yapısı oluşturur .
   add(S,x): zaten mevcut değilse, x öğesini S öğesine ekler .
   remove(S, x): varsa x öğesini S öğesinden kaldırır .
   capacity(S): S'nin tutabileceği maksimum değer sayısını döndürür .=> wikipedia


	  Bugün bu problemi çözerek java'da setlerin nasıl kullanılacağını öğreneceksiniz.
Size n çift dizi verildi. a=c ve b=d ise iki çift (a,b) ve (c,d) aynıdır.
Bu aynı zamanda (a,b)'nin (b,a) ile aynı olmadığı anlamına gelir.
Her bir çifti girdi olarak aldıktan sonra, şu anda sahip olduğunuz benzersiz çiftlerin sayısını yazdırmanız gerekir.


Giriş Biçimi

İlk satırda, çift sayısını gösteren bir tamsayı T olacaktır.
Sonraki T satırlarının her biri, tek bir boşlukla ayrılmış iki dizi içerecektir.

Kısıtlamalar:

1<=T<=100000
Her stringin uzunluğu en fazla 5 olacak ve sadece küçük harflerden oluşacaktır.

Çıkış formatı

T çizgilerini yazdırın.
i'inci satırda, i'inci çifti girdi olarak aldıktan sonra sahip olduğunuz benzersiz çiftlerin sayısını yazdırın.
	 */


 import java.util.HashSet;
 import java.util.Scanner;

 public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:");
        int t=input.nextInt();

        String[] pair_left=new String[t];
        String[] pair_right=new String[t];

        for (int i=0;i<t;i++){
            pair_left[i]=input.next();
            pair_right[i]=input.next();
        }

        HashSet<String> hSet=new HashSet<String>();
        for (int i=0;i<t;i++){
            hSet.add(pair_left[i]+"#"+pair_right[i]);
            System.out.println(hSet.size());
        }


    }
}
