package imitateSqlIn;

public class ImitateSqlInDemo {

	public static void main(String[] args) {

		// Java 模仿 SQL IN
		// 差異: sql 會根據比較值的型態轉型後進行比較,此模仿不會
		// 當比較值的型態不同時,則視為不同

		// Case 1 : String 比 String
		System.out.println("Case 1 : CompareUtils.value(\"1\").in(\"1\", \"2\", \"3\")");
		System.out.println(CompareUtils.value("1").in("1", "2", "3"));

		// Case 2 : 比較值有前補零時,兩邊都要前補零
		System.out.println("Case 2 : CompareUtils.value(\"1\").in(\"01\", \"02\", \"03\")");
		System.out.println(CompareUtils.value("1").in("01", "02", "03"));

		// Case 3 : int 比 int
		System.out.println("Case 3 : CompareUtils.value(1).in(1, 2, 3)");
		System.out.println(CompareUtils.value(1).in(1, 2, 3));

		// Case 4 : int比較時,有沒有前補零,已無差別
		System.out.println("Case 4 : CompareUtils.value(1).in(01, 2, 3)");
		System.out.println(CompareUtils.value(1).in(01, 2, 3));

		// Case 5 : double 比 double
		System.out.println("Case 5 : CompareUtils.value(0.0).in(0.0, 1.0, 2.0, 3.0)");
		System.out.println(CompareUtils.value(0.0).in(0.0, 1.0, 2.0, 3.0));

		// Case 6 : 比重複值
		System.out.println("Case 6 : CompareUtils.value(0).in(00, 0, 1, 2, 3)");
		System.out.println(CompareUtils.value(0).in(00, 0, 1, 2, 3));

		// Case 7 : 比不同型態的值,在Eclipse就會顯示ERROR
//		System.out.println(CompareUtils.value(0).in(0.0));

		// Case 8 : 比Object
		System.out.println("Case 8 : CompareUtils.value(new Object()).in(00, 0, 1, 2, 3)");
		System.out.println(CompareUtils.value(new Object()).in(00, 0, 1, 2, 3));

		// Case 9 : 比null
		System.out.println("Case 9 : CompareUtils.value(null).in(00, 0, 1, 2, 3)");
		System.out.println(CompareUtils.value(null).in(00, 0, 1, 2, 3));

		// Case 10 : 比null
		System.out.println("Case 10 : CompareUtils.value(null).in(null, 00, 0, 1, 2, 3)");
		System.out.println(CompareUtils.value(null).in(null, 00, 0, 1, 2, 3));

		// Case 11 : 比empty
		System.out.println("Case 11 : CompareUtils.value(\"\").in(null, \"\", \"00\", \"0\", \"1\", \"2\", \"3\")");
		System.out.println(CompareUtils.value("").in(null, "", "00", "0", "1", "2", "3"));

		// Case 12 : not in
		System.out.println("Case 12 : CompareUtils.value(\"\").notIn(null, \"\", \"00\", \"0\", \"1\", \"2\", \"3\")");
		System.out.println(CompareUtils.value("").notIn(null, "", "00", "0", "1", "2", "3"));

		// Case 13 : not in
		System.out.println("Case 13 : CompareUtils.value(\"\").notIn(null, \"00\", \"0\", \"1\", \"2\", \"3\")");
		System.out.println(CompareUtils.value("").notIn(null, "00", "0", "1", "2", "3"));

		// Case 14 : null not in
		System.out.println("Case 14 : CompareUtils.value(null).notIn(null, \"00\", \"0\", \"1\", \"2\", \"3\")");
		System.out.println(CompareUtils.value(null).notIn(null, "00", "0", "1", "2", "3"));

		// Case 15 : null not in
		System.out.println("Case 15 : CompareUtils.value(null).notIn(\"00\", \"0\", \"1\", \"2\", \"3\")");
		System.out.println(CompareUtils.value(null).notIn("00", "0", "1", "2", "3"));
	}
}
