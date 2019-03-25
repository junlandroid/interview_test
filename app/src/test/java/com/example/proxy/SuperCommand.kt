package com.example.proxy

/**
 * @date:2019/3/19
 * @author:junl
 * @Foreword：但行好事，莫问前程，只需努力每一天。
 * @Desc:
 */
sealed class SuperCommand {
    object A:SuperCommand()
    object B:SuperCommand()

}

fun exec(superCommand: SuperCommand) = when (superCommand) {
    SuperCommand.A -> {

    }
    is SuperCommand.B ->{

    }
}