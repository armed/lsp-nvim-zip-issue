(ns user
  (:import (com.google.common.hash Hashing HashingInputStream)
           (java.io BufferedOutputStream File)
           (java.util.zip ZipInputStream)))

(defn hashing-input-stream [stream]
  (HashingInputStream. (Hashing/sha256) stream))

