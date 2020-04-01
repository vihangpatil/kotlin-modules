import io.github.vihangpatil.kotlin.modules.lib.inf.Shape;

module io.github.vihangpatil.kotlin.modules.app {
    requires kotlin.stdlib;
    requires io.github.vihangpatil.kotlin.modules.shape;
    uses Shape;
}