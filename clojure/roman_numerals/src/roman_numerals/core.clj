(ns roman_numerals.core)

(def translator
  {1000 "M" 900 "CM" 500 "D" 400 "CD" 100 "C" 90 "XC" 50 "L" 40 "XL" 10 "X" 9 "IX" 5 "V" 4 "IV" 1 "I"})

(defn- corresponding-roman-numeral [arabic-key]
  (translator arabic-key))

(defn- largest-smaller-arabic-key [value]
  (apply max (filter #(>= value %) (keys translator))))

(defn- largest-smaller-roman-numeral [value]
  (corresponding-roman-numeral (largest-smaller-arabic-key value)))


(defn number-to-roman [arabic]
  (loop [arabic arabic
         roman  ""]
    (if (= 0 arabic)
      roman
      (recur (- arabic (largest-smaller-arabic-key arabic))
             (str roman (largest-smaller-roman-numeral arabic))))))
