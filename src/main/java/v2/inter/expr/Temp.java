package v2.inter.expr;

import v2.lexer.Lexer;
import v2.lexer.Word;
import v2.symbols.Type;

/**
 * 临时名字
 */
public class Temp extends Expr {
    public static int count = 0;
    int num = count;

    public Temp(Type type) {
        super(Word.temp, type);
        num = ++count;
    }

    public String toString() {
        return "t" + num;
    }

//    @Override
//    //临时变量不记录行号
//    public Expr gen() {
//        return this;
//    }

}
