// Generated by CoffeeScript 1.11.1
(function() {
  var countdown, cube, num, square;

  square = function(x) {
    return x * x;
  };

  cube = function(x) {
    return square(x) * x;
  };

  countdown = (function() {
    var i, results;
    results = [];
    for (num = i = 10; i >= 1; num = --i) {
      results.push(num);
    }
    return results;
  })();

}).call(this);
