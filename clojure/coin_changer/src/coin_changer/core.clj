(ns coin_changer.core)

(def coins [25 10 5 1])

(defn- largest-coin-available [total]
  (apply max (filter #(>= total %) coins)))

(defn coinchanger [total]
  (loop [total  total
         change []]
    (if (= total 0)
      change
      (recur (- total (largest-coin-available total))
             (conj change (largest-coin-available total))))))
