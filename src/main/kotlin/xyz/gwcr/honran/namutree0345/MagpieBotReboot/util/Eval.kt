package xyz.gwcr.honran.namutree0345.MagpieBotReboot.util

class Eval {
}

/**
 * 새로운 Object 를 리턴한다.
 * @param pkg 패키지 ex) nova750.kwic.com
 * @param classNm 클래스명 ex) TestObject
 * @return 생성된 Object
 * @throws Exception
 */
@Throws(Exception::class)
fun evalClass(pkg: String, classNm: String): Any? {
    return try {
        val clazz = Class.forName("$pkg.$classNm")
        clazz.newInstance()
    } catch (ce: ClassNotFoundException) {
        ce.printStackTrace()
        throw ce
    } catch (e: IllegalAccessException) {
        e.printStackTrace()
        throw e
    } catch (e: InstantiationException) {
        e.printStackTrace()
        throw e
    }
}