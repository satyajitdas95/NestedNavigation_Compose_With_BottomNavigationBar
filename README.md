This project demonstrates how to use nested navigation with Jetpack Compose and bottom navigation bar.


Nested Navigation
Nested navigation allows you to group destinations into a nested graph. This can be useful for modularizing your app's UI, such as by grouping all of the screens in a login flow into a single nested graph.

To create a nested navigation graph, you can use the NavGraphBuilder.navigation() extension function. This function takes a builder argument that you can use to provide the composables that make up the nested graph.

In this project, i have created a nested navigation graph for the login flow. The nested graph contains three composables: a login screen, a forgot password screen, and a registration screen.

The startDestination of the nested graph is the login screen. This means that when the user navigates to the nested graph, they will be taken to the login screen.

In this project, we have added a bottom navigation bar to the main screen. The bottom navigation bar contains three navigation destinations: the home screen, the Explore screen, and the profile screen.

When the user taps on a navigation destination in the bottom navigation bar, the app will navigate to the corresponding screen.

