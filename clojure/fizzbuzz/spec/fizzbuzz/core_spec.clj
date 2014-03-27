(ns fizzbuzz.core-spec
  (:require [speclj.core :refer :all]
            [fizzbuzz.core :refer :all]))

(describe "fizzbuzz"
  (for [[input output]
    [ [1 [1]]
      [2 [1 2]]
      [3 [1 2 "fizz"]]
      [4 [1 2 "fizz" 4]]
      [5 [1 2 "fizz" 4 "buzz"]]
      [6 [1 2 "fizz" 4 "buzz" "fizz"]]
      [11 [1 2 "fizz" 4 "buzz" "fizz" 7 8 "fizz" "buzz" 11]]
      [15 [1 2 "fizz" 4 "buzz" "fizz" 7 8 "fizz" "buzz" 11 "fizz" 13 14 "fizzbuzz"]]
    ]]
    (it (str "returns " output " for " input)
      (should= output (fizzbuzz input)))))
