# ImitateSqlIn
模擬SQL IN

差異: sql 會根據比較值的型態轉型後進行比較,此模仿不會
當比較值的型態不同時,則視為不同

Case 1 : CompareUtils.value("1").in("1", "2", "3")
>true

Case 2 : CompareUtils.value("1").in("01", "02", "03")
>false

Case 3 : CompareUtils.value(1).in(1, 2, 3)
>true

Case 4 : CompareUtils.value(1).in(01, 2, 3)
>true

Case 5 : CompareUtils.value(0.0).in(0.0, 1.0, 2.0, 3.0)
>true

Case 6 : CompareUtils.value(0).in(00, 0, 1, 2, 3)
>true

Case 8 : CompareUtils.value(new Object()).in(00, 0, 1, 2, 3)
>false

Case 9 : CompareUtils.value(null).in(00, 0, 1, 2, 3)
>false

Case 10 : CompareUtils.value(null).in(null, 00, 0, 1, 2, 3)
>true

Case 11 : CompareUtils.value("").in(null, "", "00", "0", "1", "2", "3")
>true

Case 12 : CompareUtils.value("").notIn(null, "", "00", "0", "1", "2", "3")
>false

Case 13 : CompareUtils.value("").notIn(null, "00", "0", "1", "2", "3")
>true

Case 14 : CompareUtils.value(null).notIn(null, "00", "0", "1", "2", "3")
>false

Case 15 : CompareUtils.value(null).notIn("00", "0", "1", "2", "3")
>true
