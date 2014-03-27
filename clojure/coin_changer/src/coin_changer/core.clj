(ns coin_changer.core)


(defn coinchanger[total]
  (loop [total  total
         change []
         coins  [25 10 5 1]]
    (if (= total 0)
      change
      (if (>= total (first coins))
        (recur (- total (first coins)) (conj change (first coins)) coins)
        (recur total change (rest coins))))))
