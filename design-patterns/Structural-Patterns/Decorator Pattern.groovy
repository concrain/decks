// http://groovy.codehaus.org/Decorator+Pattern
// TODO: look up the java.lang.reflect.Proxy

/**
 * Base Class
 */
class Logger {
    def log(String message) {
        println message
    }
}

/**
 * Decorators
 */
class TimeStampingLogger extends Logger {
    private Logger logger
    TimeStampingLogger(logger) {
        this.logger = logger
    }
    def log(String message) {
        def now = Calendar.instance
        logger.log("$now.time: $message")
    }
}
class ToUpperCaseLogger extends Logger {
    private Logger logger
    ToUpperCaseLogger(logger) {
        this.logger = logger
    }
    def log(String message) {
        logger.log(message.toUpperCase())
    }
}


def logger = new ToUpperCaseLogger(new TimeStampingLogger(new Logger()))
logger.log("G'day Mate")
// => Tue May 22 07:13:50 EST 2007: G'DAY MATE

logger = new TimeStampingLogger(new ToUpperCaseLogger(new Logger()))
logger.log('Hi There')
// => TUE MAY 22 07:13:50 EST 2007: HI THERE




/**
 * Dynamic Decorator using Groovy's Meta-Object Programming capabilities 
 * more versitile
 */
class GenericLowerDecorator {
    private delegate
    GenericLowerDecorator(delegate) {
        this.delegate = delegate
    }
    def invokeMethod(String name, args) {
        def newargs = args.collect{ arg ->
            if (arg instanceof String) return arg.toLowerCase()
            else return arg
        }
        delegate.invokeMethod(name, newargs)
    }
}


logger = new GenericLowerDecorator(new TimeStampingLogger(new Logger()))
logger.log('IMPORTANT Message')
// => Tue May 22 07:27:18 EST 2007: important message

