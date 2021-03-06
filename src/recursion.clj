(ns recursion)

(defn product [coll]
  (if (empty? coll)
    1
    (* (first coll) (product (rest coll)))))

(defn singleton? [coll]
  (and (not (nil? (first coll))) (empty? (rest coll))))

(defn my-last [coll]
  (cond (empty? coll)     nil
        (singleton? coll) (first coll)
        :else             (my-last (rest coll))))

(defn max-element [a-seq]
  (cond (empty? a-seq)     nil
        (singleton? a-seq) (first a-seq)
        :else              (max (first a-seq) (max-element (rest a-seq)))))

(defn seq-max [seq-1 seq-2]
  (let [m (cond (empty? seq-1) 2
                (empty? seq-2) 1
                :else          (seq-max (rest seq-1) (rest seq-2)))]
    (if (= m 1)
      seq-1
      seq-2)))

(defn longest-sequence [a-seq]
  (if (empty? a-seq)
    nil
    (seq-max (first a-seq) (longest-sequence (rest a-seq)))))

(defn my-filter [pred? a-seq]
  (if (empty? a-seq)
    a-seq
    (if (pred? (first a-seq))
      (cons (first a-seq) (my-filter pred? (rest a-seq)))
      (my-filter pred? (rest a-seq)))))

(defn sequence-contains? [elem a-seq]
  (cond (empty? a-seq)         false
        (= (first a-seq) elem) true
        :else                  (sequence-contains? elem (rest a-seq))))

(defn my-take-while [pred? a-seq]
  (cond (empty? a-seq)        '()
        (pred? (first a-seq)) (cons (first a-seq) (my-take-while pred? (rest a-seq)))
        :else                 '()))

(defn my-drop-while [pred? a-seq]
  (cond (empty? a-seq)        '()
        (pred? (first a-seq)) (my-drop-while pred? (rest a-seq))
        :else                 a-seq))

(defn seq= [a-seq b-seq]
  (cond (and (empty? a-seq) (empty? b-seq)) true
        (= (first a-seq) (first b-seq))		(seq= (rest a-seq) (rest b-seq))
        :else                               false))

(defn my-map [f seq-1 seq-2]
  (if (or (empty? seq-1) (empty? seq-2))
    '()
    (cons (f (first seq-1) (first seq-2)) (my-map f (rest seq-1) (rest seq-2)))))

(defn power [n k]
  (if (zero? k)
    1
    (* n (power n (dec k)))))

(defn fib [n]
  (if (< n 2)
    n
    (+ (fib (- n 1)) (fib (- n 2)))))

(defn my-repeat [how-many-times what-to-repeat]
  (if (<= how-many-times 0)
    '()
    (cons what-to-repeat (my-repeat (dec how-many-times) what-to-repeat))))

(defn my-range [up-to]
  (if (zero? up-to)
    '()
    (cons (dec up-to) (my-range (dec up-to)))))

(defn tails [a-seq]
  [:-])

(defn inits [a-seq]
  [:-])

(defn rotations [a-seq]
  [:-])

(defn my-frequencies-helper [freqs a-seq]
  [:-])

(defn my-frequencies [a-seq]
  [:-])

(defn un-frequencies [a-map]
  [:-])

(defn my-take-helper [i n coll]
  (cond (= i n)       '()
        (empty? coll) '()
        :else         (cons (first coll) (my-take-helper (inc i) n (rest coll)))))

(defn my-take [n coll]
  (my-take-helper 0 n coll))

(defn my-drop-helper [i n coll]
  (cond (= i n)       coll
        (empty? coll) coll
        :else         (my-drop-helper (inc i) n (rest coll))))

(defn my-drop [n coll]
  (my-drop-helper 0 n coll))

(defn halve [a-seq]
  (let [h (int (/ (count a-seq) 2))]
    [(my-take h a-seq) (my-drop h a-seq)]))

(defn seq-merge [a-seq b-seq]
  [:-])

(defn merge-sort [a-seq]
  [:-])

(defn split-into-monotonics [a-seq]
  [:-])

(defn permutations [a-set]
  [:-])

(defn powerset [a-set]
  [:-])