import io.github.vihangpatil.kotlin.modules.lib.impl.Circle;
import io.github.vihangpatil.kotlin.modules.lib.impl.Square;
import io.github.vihangpatil.kotlin.modules.lib.inf.Shape;

module io.github.vihangpatil.kotlin.modules.shape {
    requires kotlin.stdlib;
    exports io.github.vihangpatil.kotlin.modules.lib.inf;
    uses Shape;
    provides Shape with
            Circle,
            Square;
}