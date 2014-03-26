(ns coin_changer.core)


(defn coinchanger[total change] 
  (if (= total 0)
    change
    (if (>= total 25)
      (coinchanger (- total 25) (conj change :25))
      (if (>= total 10)
        (coinchanger (- total 10) (conj change :10))
        (if (>= total 5)
          (coinchanger (- total 5) (conj change :5))
          (if (>= total 1)
            (coinchanger (- total 1) (conj change :1)))))))
)
