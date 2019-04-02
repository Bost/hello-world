(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'hello-mies.core
   :output-to "out/hello_mies.js"
   :output-dir "out"})
