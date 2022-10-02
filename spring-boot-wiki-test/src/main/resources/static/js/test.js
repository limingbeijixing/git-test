$.extend({
    test1: function (args) {
        console.log('定义方式一：jQuery本身的扩展方法');
        console.log(this);
        console.log(args);
    }
});

$.fn.extend({
    test2: function (args) {
        console.log('定义方式二：jQuery所选对象的扩展方法');
        console.log(this);
        console.log(args);
    }
});

(function (jq) {
    jq.fn.test3 = function (args) {
        console.log('定义方式三：jQuery所选对象的扩展方法');
        console.log(this);
        console.log(args);
    }
})(jQuery);