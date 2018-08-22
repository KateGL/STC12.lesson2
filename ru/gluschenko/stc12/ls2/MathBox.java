package ru.gluschenko.stc12.ls2;

/***
 * Класс для математических операций
 */

public class MathBox {
    /***
     * Сумма двух целых чисел
     * @param  a
     * @param  b
     * @return
     *  a+b, если оба параметра не null
     *  0, если хотя бы один из параметров null
     */
    public int summa (Integer a, Integer b){
        if (a == null || b == null){
            return 0;
        }
        return a + b;
    }

    /***
     * Разница между двумя целыми числами
     * @param  a
     * @param  b
     * @return
     *  a-b, если оба параметра не null
     *  0, если хотя бы один из параметров null
     */
    public int diff (Integer a, Integer b){
        if (a == null || b == null){
            return 0;
        }
        return a-b;
    }

    public long factorial (Integer a){
        if (a == null){
            //в задании ничего не сказано про NullPointerException :)
            return 0;
        }
        if (a == 0) {
            return this.factorial(1);
        }
        return a * this.factorial(a-1);
    }

    public double dividerExceptionInside(Integer a, Integer b){
        if (a == null || b == null || a == 0.0 || b == 0.0){
            return 0.0;
        }
        return (double)a/(double)b;
    }

    public double divider(Integer a, Integer b) throws Exception{
        try{
            return (double)a/b;
        } catch(Exception e){
            throw new Exception("Throw Exception:"+e.toString());
        }
    }

    public double divider2(Integer a, Integer b) throws MathException{
        try{
            return (double)a/b;
        } catch(Exception e){
            throw new MathException("Throw Exception:"+e.toString());
        }
    }
}
