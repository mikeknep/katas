(ns coin_changer.core-spec
  (:require [speclj.core :refer :all]
            [coin_changer.core :refer :all]))


(describe "the coin changer"
          (for [[amount change]
            [
             [1 [1]]
             [2 [1 1]]
             [3 [1 1 1]]
             [4 [1 1 1 1]]
             [5 [5]]
             [6 [5 1]]
             [7 [5 1 1]]
             [10 [10]]
             [15 [10 5]]
             [17 [10 5 1 1]]
             [23 [10 10 1 1 1]]
             [25 [25]]
             [51 [25 25 1]]
             [66 [25 25 10 5 1]]
             [99 [25 25 25 10 10 1 1 1 1]]
            ]]
            (it (str "returns " change " for " amount)
                (should= change (coinchanger amount))
            ))
)
