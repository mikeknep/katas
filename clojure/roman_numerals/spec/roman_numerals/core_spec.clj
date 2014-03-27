(ns roman_numerals.core-spec
  (:require [speclj.core :refer :all]
            [roman_numerals.core :refer :all]))

(describe "roman numerals"
  (for [[arabic roman]
        [
         [1 "I"]
         [2 "II"]
         [3 "III"]
         [4 "IV"]
         [5 "V"]
         [6 "VI"]
         [7 "VII"]
         [8 "VIII"]
         [9 "IX"]
         [10 "X"]
         [13 "XIII"]
         [14 "XIV"]
         [16 "XVI"]
         [20 "XX"]
         [39 "XXXIX"]
         [40 "XL"]
         [45 "XLV"]
         [49 "XLIX"]
         [50 "L"]
         [90 "XC"]
         [100 "C"]
         [400 "CD"]
         [500 "D"]
         [900 "CM"]
         [1000 "M"]
         [3986 "MMMCMLXXXVI"]
         ]]
    (it (str "converts " arabic " to " roman)
            (should= roman (number_to_roman arabic))))
)
