module io.github.vihangpatil.kotlin.modules.shape {
    requires kotlin.stdlib;
    exports io.github.vihangpatil.kotlin.modules.lib.inf;
    uses io.github.vihangpatil.kotlin.modules.lib.inf.Shape;
    provides io.github.vihangpatil.kotlin.modules.lib.inf.Shape with
            io.github.vihangpatil.kotlin.modules.lib.impl.Circle,
            io.github.vihangpatil.kotlin.modules.lib.impl.Square;
}