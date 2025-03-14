package otus.homework.flowcats

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class CatsView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr), ICatsView {

    override fun populate(fact: Fact) {
        findViewById<TextView>(R.id.fact_textView).text = fact.fact
    }

    override fun showErrorToast(message: String?) {
        Toast.makeText(context, "Error in flow: $message", Toast.LENGTH_LONG).show()
    }
}

interface ICatsView {

    fun populate(fact: Fact)
    fun showErrorToast(massage: String?)
}