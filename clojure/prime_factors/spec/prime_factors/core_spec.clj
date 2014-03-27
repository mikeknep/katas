(ns prime_factors.core-spec
  (:require [speclj.core :refer :all]
            [prime_factors.core :refer :all]))

(describe "prime_factors_for"
  (it "returns [] for 1"
    (should= [] (prime_factors_for 1)))
  (it "returns [2] for 2"
    (should= [2] (prime_factors_for 2)))
  (it "returns [3] for 3"
    (should= [3] (prime_factors_for 3)))
  (it "returns [2 2] for 4"
    (should= [2 2] (prime_factors_for 4)))
  (it "returns [5] for 5"
    (should= [5] (prime_factors_for 5)))
  (it "returns [2 3] for 6"
    (should= [2 3] (prime_factors_for 6)))
  (it "returns [7] for 7"
    (should= [7] (prime_factors_for 7)))
  (it "returns [2 2 2] for 8"
    (should= [2 2 2] (prime_factors_for 8)))
  (it "returns [3 3] for 9"
    (should= [3 3] (prime_factors_for 9)))
  (it "returns [2 5] for 10"
    (should= [2 5] (prime_factors_for 10)))
  (it "returns [11] for 11"
    (should= [11] (prime_factors_for 11))))
